package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends Crudservice<Owner, Long> {
    Owner findByLastName(String lastName);
}
