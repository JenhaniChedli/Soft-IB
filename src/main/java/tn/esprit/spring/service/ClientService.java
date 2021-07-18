package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;

@Service
public class ClientService implements IClient {

	@Autowired
	ClientRepository clientRepository;
	@Override
	public List<Client> retrieveAllClients() {
		List<Client> clients=(List<Client>)clientRepository.findAll();
		return clients;
	}

	@Override
	public Client addClient(Client c) {
		 clientRepository.save(c);
		 return c;
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
		
	}

	@Override
	public Client updateClient(Client c) {
		return clientRepository.save(c);	
	}

	@Override
	public Client retrieveClient(Long id) {
		return clientRepository.findById(id).get();
	}

}
