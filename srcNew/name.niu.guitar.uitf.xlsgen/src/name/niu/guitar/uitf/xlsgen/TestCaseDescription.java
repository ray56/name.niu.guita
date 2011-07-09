package name.niu.guitar.uitf.xlsgen;

public class TestCaseDescription {

	private String no;
	private String testCaseId;
	private String operations;
	private String exceptedResult;

	public TestCaseDescription(String no, String testCaseId, String operations, String exceptedResult) {
		this.no = no;
		this.testCaseId = testCaseId;
		this.operations = operations;
		this.exceptedResult = exceptedResult;
	}
	
	public TestCaseDescription() {

	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getOperations() {
		return operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	public String getExceptedResult() {
		return exceptedResult;
	}

	public void setExceptedResult(String exceptedResult) {
		this.exceptedResult = exceptedResult;
	}

}
