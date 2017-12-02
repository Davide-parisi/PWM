package it.unirc.pwm.elettronica.Action.Account.Validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

import it.unirc.pwm.elettronica.Account.model.DAO.AccountDAOFactory;
import it.unirc.pwm.elettronica.Account.model.DAO.AccountDAOInterface;



public class CheckUsernameValidator extends FieldValidatorSupport{

	private AccountDAOInterface dao = AccountDAOFactory.getDAO();

	@Override

	public void validate(Object arg0) throws ValidationException {

		String username = (String) this.getFieldValue(this.getFieldName(), arg0);

		if(dao.esisteUsername(username)==true){

			addFieldError(getFieldName(), arg0);

		}



	}



}