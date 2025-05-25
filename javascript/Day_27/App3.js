let h1 = document.querySelector(".demo");
h1.setAttribute("id", "active");
h1.setAttribute("title", "HYPER TEXT MARKUP LANGUAGE");

let video = document.querySelector("video");
console.log(video); // video

//! Uncaught TypeError: Failed to execute 'setAttribute' on 'Element': 2 arguments required, but only 1 present.

video.setAttribute("controls", null);
// video.setAttribute("autoplay", "");

let style = h1.getAttribute("style");
console.log(style); // background: orange;
console.log(video.getAttribute("controls")); // null

h1.removeAttribute("style");

console.log(video.hasAttribute("src")); // true
console.log(video.hasAttribute("id")); // false