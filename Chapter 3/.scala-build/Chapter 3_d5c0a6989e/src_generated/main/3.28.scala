

final class `3$u002E28$_` {
def args = `3$u002E28_sc`.args$
def scriptPath = """3.28.sc"""
/*<script>*/

/*</script>*/ /*<generated>*//*</generated>*/
}

object `3$u002E28_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `3$u002E28$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `3$u002E28_sc`.script as `3.28`

