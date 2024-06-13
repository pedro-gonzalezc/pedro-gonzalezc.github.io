const image = document.getElementById('animated-image');

let pos = 0;
let interval = setInterval(() => {
  pos += 10;
  image.style.left = `${pos}px`;
  if (pos >= 100) {
    clearInterval(interval);
  }
}, 30);