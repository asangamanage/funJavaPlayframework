package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    public static Result index(String returnUrl) {
        return ok(index.render(returnUrl));
    }
}
