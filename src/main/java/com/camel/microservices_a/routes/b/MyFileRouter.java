package com.camel.microservices_a.routes.b;


import org.apache.camel.builder.RouteBuilder;

//@Component
public class MyFileRouter extends RouteBuilder{
	
//	@Autowired
//	private DeciderBean deciderBean;

	@Override
	public void configure() throws Exception {

		from("file:files/input")
		.log("${body}")
		.to("file:files/output");

	}

}