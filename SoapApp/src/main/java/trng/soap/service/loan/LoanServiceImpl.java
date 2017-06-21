package trng.soap.service.loan;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name = "LoanService", targetNamespace = "http://www.trng.org/LoanService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class LoanServiceImpl implements LoanService {
    
    @WebMethod(action = "http://www.trng.org/LoanService/processLoan")
    @WebResult(name = "processLoanResponse", targetNamespace = "http://www.trng.org/LoanService/", partName = "response")
	public ProcessLoanResponse processLoan(ProcessLoanRequest request) {
		// TODO Auto-generated method stub
		ProcessLoanResponse processLoanResponse = new ProcessLoanResponse();
		ProcessLoanRequest processLoanRequest = new ProcessLoanRequest();
	/*	processLoanRequest.setAmount(1200.5);
		processLoanRequest.setGender("Male");
		processLoanRequest.setSalary(10000.00);
		processLoanRequest.setTenure(true);
		processLoanResponse.setEligibilityCode("true");
		processLoanResponse.setEligibilitymessage("Good");*/
    	
    	int age = 30;
		if(age < 20){
			processLoanResponse.setEligibilityCode("100");
			processLoanResponse.setEligibilitymessage("Not Eligible");
			return processLoanResponse;
		}else if ((age > 20 && age < 25) && processLoanRequest.getSalary() > 60000 && processLoanRequest.getAmount() < 20000){
			processLoanResponse.setEligibilityCode("200");
			processLoanResponse.setEligibilitymessage("Eligible");
			return processLoanResponse;
		}else if ((age > 25 && age < 30) && processLoanRequest.getSalary() > 80000 && processLoanRequest.getAmount() < 20000){
			processLoanResponse.setEligibilityCode("200");
			processLoanResponse.setEligibilitymessage("Eligible");
			return processLoanResponse;
		}else if ((age > 30 && age < 50) && processLoanRequest.getSalary() > 100000 && processLoanRequest.getAmount() < 50000){
			processLoanResponse.setEligibilityCode("200");
			processLoanResponse.setEligibilitymessage("Eligible");
			return processLoanResponse;
		}else{
			processLoanResponse.setEligibilityCode("100");
			processLoanResponse.setEligibilitymessage("Not Eligible");
			return processLoanResponse;
		}
		
	
	}

}
