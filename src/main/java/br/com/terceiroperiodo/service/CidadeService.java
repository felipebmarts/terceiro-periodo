package br.com.terceiroperiodo.service;

import br.com.terceiroperiodo.model.Cidade;
import br.com.terceiroperiodo.repository.CidadeRepository;
import br.com.terceiroperiodo.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public Cidade salvar(Cidade cidade){
        return cidadeRepository.save(cidade);
    }

    public List<Cidade> buscarTodos(){
        List<Cidade> response = cidadeRepository.findAll();


        return response;

    }
//    public Optional<Cidade> buscarPorId(Long id){
//        return cidadeRepository.findById(id);
//    }
//
//    public Cidade atualizar(Cidade cidade){
//        return cidadeRepository.save(cidade);
//    }
//    public List<Cidade> buscarPorNome(String nome){
//        return cidadeRepository.findByNomeAndAtivo(nome, true);
//    }
//
//    public void deleteById(Long id) {
//        cidadeRepository.deleteById(id);
//    }
}
