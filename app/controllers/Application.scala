package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Redirect(routes.Application.summary)
  }

  def summary = Action {
    org.kohsuke.github.GitHub.connect()
    Redirect(routes.Application.settings)
  }

  def settings = TODO

}