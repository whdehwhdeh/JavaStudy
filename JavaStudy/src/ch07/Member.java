package ch07;

//�⺻�� �Ǵ� Ŭ����-Java Bean(����) 
//DTO(Data Transfer Object / VO(Value Object)
public class Member {
	private String id;
	String pw;
	String name;
	int age;
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//���� => �޼ҵ� 1:1 �� ��Ī
	public void setId(String id) {
		this.id = id;
		
	}
	public String getId() {
		return id;
		
	}
}