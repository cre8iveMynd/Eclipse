
public class Employee {

	  private int eid;
	  private String ename;
	  private int esal;
	  private String eadd;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	  
	  public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, int esal, String eadd) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eadd = eadd;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eadd=" + eadd + "]";
	}
	  
	  
	
}
