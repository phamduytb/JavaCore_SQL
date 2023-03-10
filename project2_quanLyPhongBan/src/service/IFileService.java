package service;

import java.util.List;

public interface IFileService {
	void writeToFile(List<Object> objects);
	
	 List<Object> readToFile();
}
