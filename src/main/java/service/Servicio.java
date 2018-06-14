package service;

import org.springframework.stereotype.Service;

import model.Matriz;



@Service
public class Servicio  implements MatrizServicio {

	
	private static MatrizRepository matrizRepository = new MatrizRepository() {
		
		@Override
		public <S extends Matriz> Iterable<S> save(Iterable<S> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends Matriz> S save(S arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Matriz findOne(Integer arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<Matriz> findAll(Iterable<Integer> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<Matriz> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean exists(Integer arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(Iterable<? extends Matriz> arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(Matriz arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(Integer arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	@Override
	public Matriz saveMatriz(Matriz matriz) {
		matrizRepository.save(matriz);
		return null;
	}

	@Override
	public void getEstadisticas() {
		matrizRepository.findAll();
		
	}

	/*
	Hashtable<String, Casa> casas = new Hashtable<String, Casa>();

	public Servicio() {

	Casa casa = new Casa();
	casa.setNombre("casa1");
	casa.setDireccion("direccion1");
	casas.put("1",casa);
	
	Casa casa1 = new Casa();
	casa1.setNombre("casa12");
	casa1.setDireccion("direccion");
	casas.put("2",casa1);
	
	}
	
	
	public Hashtable<String, Casa> getAll(){
		return casas;
		
	}
	*/
	
	
	
	
}
