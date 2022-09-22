import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: any, searchTerm: any): any {
    console.log("pratiksha9",value)
    //return value.fit,er(function (search: { voteName: string | any[] }) {
      return value.filter(function (search: { voterName: string | any[] }) {
      return search.voterName.indexOf(searchTerm) > -1;
    });
  }
}