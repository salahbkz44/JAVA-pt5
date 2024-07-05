package projecttp02;

public class MobilePhone {
	private ram ra;
	private processor proc;
	private String marque;
	private String model;
	private puce p;
	
	public MobilePhone(String marque,String model,double capacity,double freqProc,puce p){
		this.p = p;
		ra = new ram(capacity);
		proc = new processor(freqProc);
		this.marque = marque;
		this.model = model;
	}
	
	public String getmodel() {
		return model;
	}
	
	public void setmodel(String model) {
		this.model = model;
	}
	
	public String getmarque() {
		return marque;
	}
	
	public void setmarque(String marque) {
		this.marque = marque;
	}
	
	public double performance() {
		return ra.getcap()*proc.getfreq();
	}
	
	
	
	
	
	public void setnumber(String number) {
		p.setnum(number);
	}
	
	public String getnumber() {
		return p.getnum();
	}

}
