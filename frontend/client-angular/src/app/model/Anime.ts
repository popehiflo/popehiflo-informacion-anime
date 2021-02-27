/**
 * Entidad que mapea la informacion
 * obtenida del microservicio Anime
 */
export class Anime {

  /**
   * Identificador del anime
   */
  public id: number;
  /**
   * Nombre del anime
   */
  public nombre: string;
  /**
   * Anio del anime
   */
  public anio: number;
  /**
   * Fecha de creacion del anime
   */
  public fechaCreacion: Date;

}
