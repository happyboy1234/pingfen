package cn.qianshu.pingfen.entity;

public class Team {

    private Integer id;
	private String name;

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
	public Team(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
