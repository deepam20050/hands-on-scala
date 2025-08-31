

final class `3$u002E26$_` {
def args = `3$u002E26_sc`.args$
def scriptPath = """3.26.sc"""
/*<script>*/
def hello2(name: Option[String]) {
    for (s <- name) {
        println(s"Hi ${s}")
    }
}

hello2(Some("Deepam"))

hello2(None)
/*</script>*/ /*<generated>*//*</generated>*/
}

object `3$u002E26_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `3$u002E26$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `3$u002E26_sc`.script as `3.26`

