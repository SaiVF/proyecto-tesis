package svf.com.service;

import java.util.List;

import svf.com.exception.SeedException;
import svf.com.model.Seed;

public interface SeedServices {

    public Seed addSeed(Seed seed)throws SeedException;
	
	public Seed updateSeed(Seed seed)throws SeedException;

	public Seed deleteSeed(Seed seed)throws SeedException;

	public List<Seed> getAllSeeds()throws SeedException;

	public Seed getSeedById(Integer seedId) throws SeedException;

	public List<Seed> getSeedBycommonName(String commonName) throws SeedException;
	
	public List<Seed> getseedByTypeOfSeed(String typeOfSeeds) throws SeedException;

	
	
}
