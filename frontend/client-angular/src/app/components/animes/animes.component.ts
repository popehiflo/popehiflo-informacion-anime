import { Component, OnInit } from '@angular/core';
import { Anime } from '../../model/Anime';
import { AnimeService } from '../../services/anime.service';

@Component({
  selector: 'app-animes',
  templateUrl: './animes.component.html',
  styleUrls: ['./animes.component.css']
})
export class AnimesComponent implements OnInit {

  /**
   * Lista de animes a mostrar en la pantalla
   */
  public animes: Anime[];
  /**
   * Pagina actual
   */
  page:number = 1;
  /**
   * Cantidad de registros por pagina
   */
  pageSize:number = 4;
  /**
   * Cantidad total de registros
   */
  collectionSize = 0;

  /**
   * Constructor que inicializa el componente de animes
   * @param animeService
   */
  constructor( private animeService:AnimeService) { }

  ngOnInit(): void {
    this.consultarAnimes();
  }

  /**
   * Funcion para consultar los animes
   */
  consultarAnimes(): void {
    console.log('Consultando animes...');

    this.animeService.consultarAnimes().subscribe(response => {
      console.log(response);
      this.animes = response;

      this.collectionSize = this.animes.length;

      this.animes = this.animes
        .map((anime, i) => ({counter: i + 1, ...anime}))
        .slice((this.page - 1) * this.pageSize, (this.page - 1) * this.pageSize + this.pageSize);
    });
  }
}
