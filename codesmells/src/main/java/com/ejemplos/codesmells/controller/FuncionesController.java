package com.ejemplos.codesmells.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping
public class FuncionesController {

    @GetMapping("/ingresar-justificativo")
    public String ingresarJustificativo() {
        return "justificativo";
    }

    @PostMapping("/justificativo")
    public String justificativo(@RequestParam("fecha") String fecha, @RequestParam("rut") String rut, RedirectAttributes ms) {
        boolean mensaje = true;
        boolean validarFecha = true;
        boolean validarRut = true;
        ms.addFlashAttribute("mensaje", mensaje);
        ms.addFlashAttribute("validarFecha", validarFecha);
        ms.addFlashAttribute("validarRut", validarRut);
        return "hola";
    }

}
