import React from 'react';
import { Slide } from 'react-slideshow-image';
import 'react-slideshow-image/dist/styles.css';

const slideImages = [
  {
    url: 'https://static.vecteezy.com/system/resources/previews/023/729/640/large_2x/a-collection-of-fruits-on-a-supermarket-shelf-fresh-fruit-products-in-the-mall-generative-ai-photo.jpg',
    caption: 'Fresh Fruits'
  },
  {
    url: 'https://seconduse.com/wp-content/uploads/2016/04/closet.jpg',
    caption: 'Clothes Collection'
  },
  {
    url: 'https://tse4.mm.bing.net/th/id/OIP.9826uPNDrhdeRTsQ6pqRsgHaEK?w=1920&h=1080&rs=1&pid=ImgDetMain&o=7&rm=3',
    caption: 'Laptops for Every Need'
  },
  {
    url: 'https://www.paldrop.com/wp-content/uploads/2018/09/must-have-kitchen-appliances.jpeg',
    caption: 'Home Appliances'
  }
];

const divStyle = {
  display: 'flex',
  alignItems: 'center',
  justifyContent: 'center',
  backgroundSize: "cover",
  backgroundPosition: 'center',
  height: '85vh',
  color: 'white',
  fontSize: '2rem',
  fontWeight: 'bold',
  textShadow: '2px 2px 8px rgba(0,0,0,0.7)',
  textAlign: 'center',
  padding: '0 20px',
};

const properties = {
  duration: 3000,
  autoplay: true,
  transitionDuration: 800,
  arrows: true,
  infinite: true,
  easing: 'ease',
};

const Home = () => {
  return (
    <div className="slide-container">
      <Slide {...properties}>
        {slideImages.map((slideImage, index) => (
          <div key={index}>
            <div
              style={{
                ...divStyle,
                backgroundImage: `url(${slideImage.url})`
              }}
            >
              {slideImage.caption}
            </div>
          </div>
        ))}
      </Slide>
    </div>
  );
};

export default Home;
