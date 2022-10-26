package com.Portfolio.Benitez.Interface;

import com.Portfolio.Benitez.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar objeto tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un Persona por ID
    public void deletePersona(Long id);
    
    //Buscar un Persona por ID
    public Persona findPersona(Long id);
}
