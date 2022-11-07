plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-js"))
    api(project(":kotlin-browser"))

    api(devNpmv("csstype"))
}
