import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Anime } from '../model/Anime';

@Injectable({
  providedIn: 'root'
})
export class AnimeService {

  /**
   * URL base del microservicio de animes (SpringBoot)
   */
  private baseUrl = 'http://localhost:8080/anime';

  /**
   * Constructor que inicializa el servicio
   * @param httpClient
   */
  constructor( private httpClient: HttpClient ) { }

  /**
   * Funcion que permite consumir el servicio para consultarAnimes
   */
  consultarAnimes(): Observable<Anime[]> {

    //return this.httpClient.get<Anime[]>(this.baseUrl + '/consultarAnimes');
    return this.httpClient.get<Anime[]>(`${this.baseUrl}/consultarAnimes`);

  }

}
