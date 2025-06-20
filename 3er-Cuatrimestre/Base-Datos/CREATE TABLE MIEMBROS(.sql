create or replace procedure ins_dat_dep (
   clave  in departamentos.clave_depto%type,
   nombre in departamentos.nom_depto%type
) is
begin
   insert into departamentos values ( clave,
                                      nombre );

   commit;
   dbms_output.put_line('hubo un error, la clave ya existe');
end ins_dat_dep;
/
execute ins_dat_dep(1314, 'prueba');

create or replace procedure ins_dat_puest (
   clave  in puestos.clave_puesto%type,
   nombre in puestos.nom_puesto%type
) is
begin
   insert into departamentos values ( clave,
                                      nombre );
   commit;
   dbms_output.put_line('hubo un error, la clave ya existe');
end ins_dat_puest;
/

create or replace procedure ins_dat_jefe (
   clave   in jefes.clave_jefe%type,
   nombre  in jefes.nom_jefe%type,
   ape_pat in jefes.ap_pat_jefe%type,
   ape_mat in jefes.ap_mat_jefe%type
) is
begin
   insert into departamentos values ( clave,
                                      nombre,
                                      ape_pat,
                                      ape_mat );
   commit;
   dbms_output.put_line('hubo un error, la clave ya existe');
end ins_dat_jefe;
/

create or replace procedure ins_dat_empl (
   clave               in empleados.codigo_emp%type,
   nombre              in empleados.nombre_emp%type,
   ape_pat             in empleados.ape_pat_emp%type,
   ape_mat             in empleados.ape_mat_emp%type,
   email               in empleados.email_emp%type,
   telefono            in empleados.tel_emp%type,
   contratacion        in empleados.fecha_cont%type,
   sueldo              in empleados.sueldo%type,
   porcentaje_comision in empleados.porcentaje_comision%type,
   descripcion_persona in empleados.descripcion_persona%type,
   clave_puesto        in empleados.clave_puesto%type,
   clave_jefe          in empleados.clave_jefe%type,
   clave_depto         in empleados.clave_depto%type
) is
begin
   insert into departamentos values ( clave,
                                      nombre,
                                      ape_pat,
                                      ape_mat,
                                      email,
                                      telefono,
                                      contratacion,
                                      sueldo,
                                      porcentaje_comision,
                                      descripcion_persona,
                                      clave_puesto,
                                      clave_jefe,
                                      clave_depto );
   commit;
   dbms_output.put_line('hubo un error, la clave ya existe');
end ins_dat_jefe;
/

   set serveroutput on;

declare
   v_mat_alum         alumnos.mat_alum%type := &mat_alum;
   v_prom_parcial_dos boletas.parcial_dos%type;
   v_resultado        varchar2(30);
begin
   select avg(boletas.parcial_dos)
     into v_prom_parcial_dos
     from alumnos
    inner join boletas
   on alumnos.alumnos.mat_alum = boletas.mat_alum
    where alumnos.mat_alum = v_mat_alum;
   v_resultado :=
      case
         when v_prom_parcial_dos >= 8 then
            'aprovado'
         when v_prom_parcial_dos between 7 and 7.9 then
            'reprobado'
         else 'repetir curso'
      end;

   dbms_output.put_line('promedio segundo parcial' || to_char(v_prom_parcial_dos));
   dbms_output.put_line('situacion academica' || to_char(v_resultado));
   commit;
end;
/

variable g_parcial_tres number
variable g_prom_parcial_uno number
begin
   select avg(boletas.parcial_tres),
          avg(boletas.parcial_uno)
     into
      :g_parcial_tres,
      :g_prom_parcial_uno
     from alumnos
    inner join boletas
   on alumnos.mat_alum = boletas.mat_alum
    where alumnos.mat_alum = 20174004;

end;
/
print g_parcial_tres
print g_prom_parcial_uno
/