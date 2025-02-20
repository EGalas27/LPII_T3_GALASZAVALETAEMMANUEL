package com.bd.essalud.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.bd.essalud.modelo.TblMedico;
import com.bd.essalud.servicio.IMedicoServicio;

@Controller

@RequestMapping("/Vistas")
public class MedicoController {
	
	
	@Autowired
	private IMedicoServicio imedicoservicio;

	// Asocia URL con el método
	@GetMapping("ListadoMedico")
	//Recibe nombre desde URL
    public String listarMedico(Model modelo) {

		List<TblMedico> listado=imedicoservicio.ListadoMedico();
        
        //Guarda lista en el modelo
        modelo.addAttribute("listado", listado);
 
        //Retorna la vista donde la mostrará  filtrada
        return "/Vistas/ListadoMedico";
    }
	
	
	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model modelo) {
		// Crear objeto vacío
		TblMedico tblmed = new TblMedico();
		//Se envía a vista el objeto
		modelo.addAttribute("regmedico", tblmed);
		//Carga página del form
		return "/Vistas/FrmRegMedico";
	}
	
	// Mapea la acción cuando se envía form
	@PostMapping("/GuardarMedico")
	//Recibe producto enviado desde form
	public String GuardarMedico(@ModelAttribute TblMedico tblmed, RedirectAttributes redirectAttributes) {
		try {
			//Guardar producto en BD
            imedicoservicio.RegistrarMedico(tblmed);
            // Agregar mensaje de éxito
            redirectAttributes.addFlashAttribute("mensaje", "Medico registrado exitosamente.");
            
        } catch (Exception e) {
        	// Agregar mensaje de error
            redirectAttributes.addFlashAttribute("mensaje", "Error al registrar al Medico.");
           
        }
		 // Redirigir a lista
        return "redirect:/Vistas/ListadoMedico";
		
	}
	
	
	@GetMapping("/Eliminarmedico/{id}")
	// Captura ID de URL
	public String eliminar(@PathVariable("id") Integer idmedico, RedirectAttributes redirectAttributes) {
		try {
			// Crear objeto medico con el ID
            TblMedico tblmed = new TblMedico();
            tblmed.setIdmedicot3(idmedico);
            // Llamar al servicio para eliminarlo
            imedicoservicio.EliminarMedico(tblmed);
            // Agregar mensaje de éxito
            redirectAttributes.addFlashAttribute("mensaje", "Medico eliminado correctamente.");
           
        } catch (Exception e) {
        	// Agregar mensaje de error
            redirectAttributes.addFlashAttribute("mensaje", "Error al eliminar al Medico.");
           
        }
        return "redirect:/Vistas/ListadoMedico";
	

}
}
