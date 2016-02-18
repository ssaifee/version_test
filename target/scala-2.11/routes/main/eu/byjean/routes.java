
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saniyasaifee/Downloads/blog-samples-painless-sbt-build/conf/routes
// @DATE:Thu Feb 18 15:18:41 EST 2016

package eu.byjean;

import router.RoutesPrefix;

public class routes {
  
  public static final eu.byjean.ReverseHealth Health = new eu.byjean.ReverseHealth(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final eu.byjean.javascript.ReverseHealth Health = new eu.byjean.javascript.ReverseHealth(RoutesPrefix.byNamePrefix());
  }

}
