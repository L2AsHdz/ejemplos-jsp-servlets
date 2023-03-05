package com.ipc2.holamundoservlet.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Arrays;

@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contraseña");
        String sexo = request.getParameter("sexo");
        String[] idiomas = request.getParameterValues("idiomas[]");
        LocalDate fechaNacimiento = LocalDate.parse(request.getParameter("fecha_nacimiento"));
        String pais = request.getParameter("pais");

        System.out.println("Nombre: " + nombre);
        System.out.println("Contraseña: " + contrasena);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idiomas: " + Arrays.toString(idiomas));
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("País: " + pais);

























        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("""
                <!DOCTYPE html>
                <html>
                <head>
                	<title>Registro completado</title>
                	<style>
                		body {
                			background-color: #f2f2f2;
                			font-family: Arial, sans-serif;
                		}
                                
                		.container {
                			max-width: 500px;
                			margin: 0 auto;
                			padding: 20px;
                			background-color: #fff;
                			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
                			border-radius: 5px;
                			text-align: center;
                		}
                                
                		h1 {
                			color: #1a1a1a;
                			font-size: 32px;
                			margin-top: 0;
                		}
                                
                		p {
                			color: #666;
                			font-size: 18px;
                			margin-bottom: 20px;
                		}
                                
                		button {
                			background-color: #4CAF50;
                			border: none;
                			color: white;
                			padding: 10px 20px;
                			text-align: center;
                			text-decoration: none;
                			display: inline-block;
                			font-size: 16px;
                			border-radius: 5px;
                			cursor: pointer;
                		}
                                
                		button:hover {
                			background-color: #3e8e41;
                		}
                	</style>
                </head>
                <body>
                	<div class="container">
                		<h1>Registro completado</h1>
                		<p>La información ha sido registrada correctamente.</p>
                		<button onclick="window.location.href='index.html'">Volver al inicio</button>
                	</div>
                </body>
                </html>
        """);
    }
}
