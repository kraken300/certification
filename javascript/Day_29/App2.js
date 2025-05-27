let video = document.querySelector("video");

video.addEventListener("click", function (e) {
    let t = video.classList.toggle("active");
    if (t) e.target.play();
    else e.target.pause();
});

video.addEventListener("mouseover", function (e) {
    e.target.play();
});

video.addEventListener("mouseout", function (e) {
    e.target.pause();
});