def hello2(name: Option[String]) {
    for (s <- name) {
        println(s"Hi ${s}")
    }
}

hello2(Some("Deepam"))

hello2(None)