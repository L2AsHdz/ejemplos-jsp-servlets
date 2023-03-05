package com.ipc2.holamundoservlet.datos;

import com.ipc2.holamundoservlet.model.Tarea;

import java.util.ArrayList;
import java.util.List;

public class TareaDB {
    public List<Tarea> getTareas() {
        List<Tarea> tareas = new ArrayList<>();

        tareas.add(new Tarea(1, "Tarea 1", "Descripción de la tarea 1", "2020-01-01", "Completada"));
        tareas.add(new Tarea(2, "Tarea 2", "Descripción de la tarea 2", "2020-01-02", "Pendiente"));
        tareas.add(new Tarea(3, "Tarea 3", "Descripción de la tarea 3", "2020-01-03", "Sin iniciar"));
        tareas.add(new Tarea(4, "Tarea 4", "Descripción de la tarea 4", "2020-01-04", "Pendiente"));
        tareas.add(new Tarea(5, "Tarea 5", "Descripción de la tarea 5", "2020-01-05", "Completada"));
        return tareas;
    }
}
