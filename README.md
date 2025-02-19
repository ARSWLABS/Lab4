# Lab 4
## Primera parte
### Parte I. Ejercicio básico.
En este punto del laboratorio nos piden hacer uso del las anotaciones de spring boot, las cuales son @Servuce y @Autowired.
El @Service:
Es una anotación especial para marcar una clase como un componente de servicio dentro de la capa de negocio
Es un estereotipo de Spring (como @Component y @Repository).
Hace que la clase sea detectada automáticamente por el escaneo de componentes (@ComponentScan).
El @Autowired
Se usa para inyectar dependencias en Spring.
Puede aplicarse a campos, constructores o métodos setter
Permite que Spring resuelva y asigne automáticamente el bean correspondiente.
📌 Diferencia clave
<span style="color: gray;">@Service</span> marca una clase como un servicio administrado por Spring.
@Autowired inyecta una dependencia administrada por Spring en otra clase.
