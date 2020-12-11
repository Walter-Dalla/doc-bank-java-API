package br.com.dalla.ezdevs.bank.accont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Body.MoneyTransferModel;

@RestController
@RequestMapping("/")
public class AccontController {
	AccontRepository repository;
	
	public AccontController() {
		this.repository = new AccontRepository();
	}
	
	@GetMapping("/accont/{id}")
	public AccontModel getAccont(
			@PathVariable("id")
			Integer id) {
		
		return repository.findById(id);
	}
	
	@PostMapping("/pay")
	public AccontModel payAccont(@RequestBody MoneyTransferModel moneyTransferBody) {
		
		AccontModel myAccont = repository.findById(moneyTransferBody.getMyId());
		AccontModel toAccont = repository.findById(moneyTransferBody.getPayToId());
		
		if(myAccont.getMoney() -moneyTransferBody.getMoney() < 0) {
			return null;
		}else {
			myAccont.setMoney(myAccont.getMoney() - moneyTransferBody.getMoney());
			toAccont.setMoney(toAccont.getMoney() + moneyTransferBody.getMoney());
		}
		return new AccontModel(1, 100);
	}
	
	
	
	
}
