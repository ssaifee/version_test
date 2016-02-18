
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saniyasaifee/Downloads/blog-samples-painless-sbt-build/conf/routes
// @DATE:Thu Feb 18 15:18:41 EST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package eu.byjean.javascript {
  import ReverseRouteContext.empty

  // @LINE:1
  class ReverseHealth(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def check: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "eu.byjean.Health.check",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "health"})
        }
      """
    )
  
  }


}