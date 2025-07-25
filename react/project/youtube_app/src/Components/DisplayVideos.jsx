import React, { useState } from 'react';
import { videos } from "../../videos.json";

const DisplayVideos = () => {

  let [videosData, setVideosData] = useState(videos);

  let [input, setInput] = useState("");

  // let videoRef = useRef(null);

  let handleChange = (e) => {
    let keyword = e.target.value;
    setInput(keyword);

    const result = videos.filter((v) => {
      return v.title.toLowerCase().includes(keyword.toLowerCase());
    });

    console.log(result);
    setVideosData(result);
  }

  // let handleMouseEnter = (e) =>{
  //   e.target.play();
  // }

  //  let handleMouseLeave = (e) =>{
  //   e.target.pause();
  // }

  return (
    <div className='container'>
      <form>
        <input type="text" name="search" id="search" placeholder="Search video" value={input} onChange={handleChange} />
      </form>

      <div className="grid">
        {
          videosData?.map((v, i) => {
            return (
              <div className="card" key={i + 1}>
                <video 
                src={v.sources[0]} 
                controls 
                width={400} 
                height={240} 
                poster={v?.thumbnail}
                ></video>
                <h2>{v.title}</h2>
              </div>
            )
          })
        }
      </div>
    </div>
  )
}

export default DisplayVideos;
