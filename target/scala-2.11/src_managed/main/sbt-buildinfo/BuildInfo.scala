package eu.byjean

import java.io.File
import java.net.URL

/** This object was generated by sbt-buildinfo. */
case object BuildInfo {
  /** The value is "ultimate-build". */
  val name: String = "ultimate-build"
  /** The value is "1.0.0-bead632103e46e214c33868a92a01d5c9351a1a5". */
  val version: String = "1.0.0-bead632103e46e214c33868a92a01d5c9351a1a5"
  /** The value is "2.11.7". */
  val scalaVersion: String = "2.11.7"
  /** The value is "0.13.9-RC1". */
  val sbtVersion: String = "0.13.9-RC1"
  override val toString: String = "name: %s, version: %s, scalaVersion: %s, sbtVersion: %s" format (name, version, scalaVersion, sbtVersion)
}