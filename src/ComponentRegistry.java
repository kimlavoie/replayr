import java.util.Hashtable;
import java.awt.Component;

public class ComponentRegistry{
	private static ComponentRegistry registry = new ComponentRegistry();
	private Hashtable<String, Component> hash;
	
	
	private ComponentRegistry(){
		hash = new Hashtable<String, Component>();
	}
	
	public static ComponentRegistry getRegistry(){
		return registry;
	}
	
	public Component getComponent(String id){
		return hash.get(id);
	}
	
	public void registerComponent(String id, Component component){
		hash.put(id, component);
	}
}
