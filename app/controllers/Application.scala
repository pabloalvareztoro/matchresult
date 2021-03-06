package controllers

import play.api.mvc._
import play.api.libs.json.Json._

object Application extends Controller {

  def index = Action { implicit request =>
    Ok("Match Result service")
  }

  private def currentApi(implicit request: RequestHeader) = {
    toJson(Map(
      "root" -> request.uri
    ))
  }
}
