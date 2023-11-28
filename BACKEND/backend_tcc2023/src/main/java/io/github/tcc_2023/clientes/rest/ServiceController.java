package io.github.tcc_2023.clientes.rest;





import io.github.tcc_2023.clientes.model.entity.ServicosPrestados;
import io.github.tcc_2023.clientes.model.repository.ServiceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping
public class ServiceController {

    private final ServiceRepository repository;

    public ServiceController (ServiceRepository repository){
        this.repository = repository;
    }

     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)
    public ServicosPrestados salvar(@RequestBody ServicosPrestados servicosPrestados) {
         return repository.save(servicosPrestados);
     }


    @GetMapping("{id}")
    public ServicosPrestados buscarServico(@PathVariable Integer id) {
        return repository
                .findById(id)
                .orElseThrow(( () -> new ResponseStatusException(HttpStatus.NOT_FOUND))
                );
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository
                .findById(id)
                .map(servicosPrestados -> {
                    return Void.TYPE;

                })
                .orElseThrow(() -> new   ResponseStatusException((HttpStatus.NOT_FOUND)));
    }

    @PutMapping("{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody ServicosPrestados servicosPrestadosAtualizado){
        repository
                .findById(id)
                .map(servicosPrestados -> {
                    servicosPrestadosAtualizado.setId(servicosPrestados.getId());
                    return repository.save(servicosPrestadosAtualizado);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }




}
