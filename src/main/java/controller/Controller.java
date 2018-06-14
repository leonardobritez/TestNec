package controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.MainMatrizs;
import model.Matrix;
import model.Matriz;
import service.MatrizRepository;
import service.Servicio;


@RestController
public class Controller {

	
	
	
	@Autowired
	Servicio servicio;
	
	

	Map<String, Integer> nameTracker = new HashMap<>();
	
	
	
	//   {“matrix”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]} 
	@RequestMapping(value = "/fingerPrint", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public Boolean saveFruits(@RequestBody Matrix matrix){
		Matriz matriz;
		
		String[] arrayString = matrix.getMatrix().stream().toArray(String[]::new);
		boolean value = MainMatrizs.isFingerPrint(arrayString);
		
		if(value){
			 matriz = new Matriz(1, 0, new BigDecimal(0));
		}else{
			 matriz = new Matriz(0, 1, new BigDecimal(0));
		}
		
		servicio.saveMatriz(matriz);
		return value;
	}
	
	
	
	
	
	//   : {“count_valid_fingerPrint”:40, “count_not_valid_fingerPrint”:100: “ratio”:0.4} 
	/*@RequestMapping("“/stats")
	public Hashtable<String, Casa> servicio2(){
		return servicio.getAll();
	}*/
	
		
	
	
	
	
	
}
