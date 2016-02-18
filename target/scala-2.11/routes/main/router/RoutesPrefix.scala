
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saniyasaifee/Downloads/blog-samples-painless-sbt-build/conf/routes
// @DATE:Thu Feb 18 15:18:41 EST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
