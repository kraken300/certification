import axios from 'axios';
import React, { useState } from 'react';

const Weather = (props) => {

    let [city, setCity] = useState("");
    // let [latitude, setLatitude] = useState("");
    // let [longitude, setLongitude] = useState("");
    let [cityData, setCityData] = useState(null);

    let handleChange = (e) => {
        setCity(e.target.value);
    }

    let handleSubmit = (e) => {
        e.preventDefault();
        // axios.get(`https://geocoding-api.open-meteo.com/v1/search?name=${city}`)
        //     .then(
        //         ({ data }) => {
        //             // console.log(data.results[0]);
        //             let { latitude, longitude } = data.results[0];
        //             // setLatitude(latitude);
        //             // setLongitude(longitude);

        //             axios.get(`https://api.open-meteo.com/v1/forecast?latitude=${latitude}&longitude=${longitude}&current_weather=true&timezone=auto`)
        //                 .then(
        //                     ({ data }) => {
        //                         console.log(data);
        //                         let { current_weather, current_weather_units } = data;
        //                     },
        //                     (error) => console.log(error)
        //                 )
        //         },
        //         (error) => console.log(error)
        //     )
        axios.get(`https://api.openweathermap.org/data/2.5/weather?q=${city}&units=metric&appid=${props.api_key}`)
            .then(
                ({ data }) => {
                    console.log(data);
                    setCityData(data);
                },
                (error) => console.log(error)
            )
    }

    return (
        <div className='container'>
            <form onSubmit={handleSubmit}>
                <input type="text" name="city" id="city" placeholder='Enter city name' value={city} onChange={handleChange} required />

                <button type="submit">Search</button>
            </form>

            {
                cityData && (
                    <section className='card'>
                        <h2>{cityData?.name}</h2>
                        <h2>{cityData?.main.temp} &deg;C</h2>
                        <p>Humidity : {cityData?.main.humidity}%</p>
                        <h3>{cityData?.weather[0].description}</h3>
                        <img src={`https://openweathermap.org/img/wn/${cityData?.weather[0].icon}@2x.png`} alt="weather-icon" />
                        <h3>Wind Speed : {Math.trunc(cityData?.wind.speed * 3.6)} km/h</h3>
                    </section>
                )
            }
        </div>
    )
}

export default Weather;
