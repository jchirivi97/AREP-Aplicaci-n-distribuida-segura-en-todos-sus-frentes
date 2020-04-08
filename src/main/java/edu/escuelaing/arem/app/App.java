package edu.escuelaing.arem.app;

import static spark.Spark.*;

public class App {
	public static void main(String[] args) {
		port(4567);
		
		secure("/arquitectura-segura/ecikeystore.p12","jimmy970126",null,null);
		get("/hello", (req, res) -> "Hello World");
	}

}
