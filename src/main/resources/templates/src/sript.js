gsap.to(".box", {
    x: 200,
    xPercent: -100,
    y: 300,
    duration:2,
    rotation : 50,
    ease: "elastic",
    force3D: true

});

gsap.to(".green", { rotation: 1200, duration: 2, ease: "none" });

gsap.to(".bar", {
    x: 500,
    у: 300,
    duration:5,
    attr: {
        fill: '#8d3dae',
        rx: 50,
    }
});

gsap.from(".box1", {
    x: 200,
    у: 300,
    duration: 2,
    scale: 0.5,
    opacity: 0,
    delay: 0.5,
    stagger: 0.2,
    ease: "elastic",
    force3D: true
});

gsap.to(".circle1", {
    x: 200,
    xPercent: -100,
    y: 300,
    duration:2,
    rotation : 50,
    ease: "elastic",
    force3D: true
});

