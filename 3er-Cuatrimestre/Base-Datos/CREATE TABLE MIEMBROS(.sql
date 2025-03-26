   set serveroutput on
VARIABLE g_prom_partres NUMBER
VARIABLE g_prom_paruno NUMBER

begin
   select avg(parcial_tres),
          avg(parcial_uno)
     into
      :g_prom_partres,
      :g_prom_paruno
     from boletas
    where mat_alum = 20174004;
   dbms_output.put_line('El promedio del parcial uno es: ' || to_char(:g_prom_paruno));
   dbms_output.put_line('El promedio del parcial tres es: ' || to_char(:g_prom_partres));
end;


set serveroutput ON

declare
v_mat_alum boletas.
  v_segundo_parcial boletas.segundo_parcial%type;