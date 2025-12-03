package com.loja.backend.config;

import com.loja.backend.model.Product;
import com.loja.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProductRepository repository) {
        return args -> {
            repository.save(new Product(
                    null,
                    "Grimmerie",
                    179.90,
                    "7891234567890",
                    "https://th.bing.com/th/id/OIP.-UozGXkhrch6yITlX2ZTHAAAAA?w=188&h=188&c=7&r=0&o=7&pid=1.7&rm=3"));

            repository.save(new Product(
                    null,
                    "DarkHold",
                    299.90,
                    "7891234567891",
                    "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/11fae382-e99a-475a-9e3c-314aea101da4/df5e7i9-26c87808-e986-4eb1-80e1-47734137bc84.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzExZmFlMzgyLWU5OWEtNDc1YS05ZTNjLTMxNGFlYTEwMWRhNFwvZGY1ZTdpOS0yNmM4NzgwOC1lOTg2LTRlYjEtODBlMS00NzczNDEzN2JjODQucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.dKIsZvb81IrYbNPh3J6030fUKg-NUJPm-RJoptPZQEE"));

            repository.save(new Product(
                    null,
                    "Varinha das varinhas",
                    159.90,
                    "7891234567892",
                    "https://down-br.img.susercontent.com/file/sg-11134201-7rbmi-lnnc62v612922f"));

            repository.save(new Product(
                    null,
                    "Capa Uniforme da Sonserina",
                    379.90,
                    "7891234567893",
                    "https://http2.mlstatic.com/D_NQ_NP_660894-CBT71838192498_092023-O.webp"));

            repository.save(new Product(
                    null,
                    "Óculos do Harry Potter",
                    199.90,
                    "7891234567894",
                    "https://www.pngkit.com/png/full/105-1057656_harry-potter-glasses.png"));

            repository.save(new Product(
                    null,
                    "Funko Scarlet Witch",
                    299.90,
                    "7891234567895",
                    "https://funko.com/on/demandware.static/-/Sites-funko-master-catalog/default/dwb34b293b/images/funko/upload/69438_DSMM_ScarletWitchGW_POP_GLAM-WEB.png"));

            repository.save(new Product(
                    null,
                    "Funko The Wicked Witch of the West",
                    299.90,
                    "7891234567896",
                    "https://media.entertainmentearth.com/assets/images/2037145fa2d9401a9d2b3b52d787148dxl.jpg"));

            repository.save(new Product(
                    null,
                    "Boneco Ryomen Sukuna",
                    159.90,
                    "7891234567897",
                    "https://www.atacadocollections.com/img/g/boneco-bandai-s-h-figuarts-jujutsu-kaisen-sukuna-21047--img_154437_1.jpg"));

            repository.save(new Product(
                    null,
                    "Pelucia Mimikyu",
                    149.90,
                    "7891234567898",
                    "https://www.pngplay.com/wp-content/uploads/11/Mimikyu-Pokemon-PNG-Pic-Clip-Art-Background.png"));

            repository.save(new Product(
                    null,
                    "Kit de Chaveiros de Pokemon",
                    49.90,
                    "7891234567899",
                    "https://a-static.mlcdn.com.br/800x560/atacado-10-chaveiros-emborrachados-alto-relevo-pokemon-agileparts/agileparts/pokemon10/9e39f1c57bd2c9c2eb78106f2aa43f90.jpeg"));

            repository.save(new Product(
                    null,
                    "Hatsune Miku Nendoroid",
                    199.90,
                    "7891234567990",
                    "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/1ffb340c-45b5-4137-8b12-98f2fe9645c6/de2yuub-790daf18-6551-404d-b12c-b57b768dae13.png/v1/fit/w_800,h_779/hatsune_miku_nendoroid__png__by_autism79_de2yuub-414w-2x.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9Nzc5IiwicGF0aCI6Ii9mLzFmZmIzNDBjLTQ1YjUtNDEzNy04YjEyLTk4ZjJmZTk2NDVjNi9kZTJ5dXViLTc5MGRhZjE4LTY1NTEtNDA0ZC1iMTJjLWI1N2I3NjhkYWUxMy5wbmciLCJ3aWR0aCI6Ijw9ODAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.Swgho4QValvB80nuM30wjG0r9LLGZLox5QMWaN-sNUg"));

            repository.save(new Product(
                    null,
                    "Hinata Hyuga Nendoroid",
                    199.90,
                    "7891234567991",
                    "https://tse3.mm.bing.net/th/id/OIP.WJj8EqGFXbrwTaCvbIjgFwHaHa?rs=1&pid=ImgDetMain&o=7&rm=3"));
        };
    }
}
