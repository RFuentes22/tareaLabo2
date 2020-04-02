package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.credential.Credential;


@Controller
public class MainController {
		@GetMapping("/Login")
		public String enviarForm(Credential credential) {
			return "Login";
		}
		
		@PostMapping("/validacion")
		public String procesarForm(Credential credential ) {
			if(credential.getUser().equals("admin") && credential.getPassword().equals("admin") ) {
				return "MostrarMensajeV";
			}
			else {
				return "MostrarMensajeF";
			}
		}
}
