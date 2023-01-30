package tarea5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tarea5 {

    public static Scanner rm = new Scanner(System.in);
    public static ArrayList almacenar = new ArrayList();

    public static void main(String[] args) {

        int opc = 0;
        while (opc != 6) {
            try {
                System.out.println("""
                                ~~~~~~~~~~~~~~~~~~~~~~~
                                1. Agregar Producto
                                2. Modificar Producto
                                3. Eliminar Producto
                                4. Simulación de Facturación
                                5. Reporte
                                6. Salir
                                """);
                rm = new Scanner(System.in);
                opc = rm.nextInt();

                switch (opc) {
                    case 1 ->
                        agregar();
                    case 2 ->
                        modificar();
                    case 3 ->
                        eliminar();
                    case 4 ->
                        factura();
                    case 5 ->
                        reporte();

                }
            } catch (Exception e) {
                opc = 0;
                System.out.println(">>> OPCION NO ES VALIDA <<<");
            }

        }//fin del while

    }//fin del main

    public static void agregar() {
        System.out.print("""
                           = = = = = =
                           Agregar:
                           1. Granos Basicos
                           2. Productos de Limpieza
                           3. Liquidos
                           4. Carnes y Embutidos
                           5. Frutas/Verduras
                           -> """);
        rm = new Scanner(System.in);
        int opc = rm.nextInt();

        switch (opc) {
            case 1 -> {
                String unimedida = "";
                System.out.print("Nombre -> ");
                rm = new Scanner(System.in);
                String nombre = rm.nextLine();

                System.out.print("Cantidad de quintales -> ");
                rm = new Scanner(System.in);
                int cantquin = rm.nextInt();

                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }

                System.out.print("""
                                Unidad de medida:
                                1. Libra
                                2. Medida
                                3. Kilo
                                -> """);
                rm = new Scanner(System.in);
                int med = rm.nextInt();
                switch (med) {
                    case 1 ->
                        unimedida = "Libra";
                    case 2 ->
                        unimedida = "Medida";
                    case 3 ->
                        unimedida = "Kilo";
                }

                System.out.print("Lugar de procedencia -> ");
                rm = new Scanner(System.in);
                String procedencia = rm.nextLine();

                almacenar.add(new GranosBasicos(cantquin, precio, nombre, unimedida, procedencia));
                System.out.println("++ PRODUCTO AGREGADO EXITOSAMENTE ++");

            }
            case 2 -> {
                String tipo = "";
                System.out.print("""
                                 Tipo:
                                1. Liquido
                                2. Polvo
                                -> """);
                rm = new Scanner(System.in);
                int med = rm.nextInt();
                switch (med) {
                    case 1 ->
                        tipo = "Liquido";
                    case 2 ->
                        tipo = "Polvo";

                }

                System.out.print("Marca -> ");
                rm = new Scanner(System.in);
                String marca = rm.nextLine();

                String codigo = "";
                boolean x = true;
                while (x) {
                    System.out.print("Codigo -> ");
                    rm = new Scanner(System.in);
                    codigo = rm.nextLine();
                    x = false;
                    for (Object o : almacenar) {
                        if (o instanceof ProductosLimpieza) {
                            if (((ProductosLimpieza) o).getCodigo().equals(codigo)) {
                                System.out.println(">>> CODIGO YA ESTA EN USO <<<");
                                x = true;
                            }
                        }
                    }
                }// fin del while de codigo

                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }

                boolean f = true;
                int cantInventariar = 0;
                while (f) {
                    System.out.print("Cantidad a inventariar -> ");
                    rm = new Scanner(System.in);
                    cantInventariar = rm.nextInt();
                    if (cantInventariar <= 0) {
                        System.out.println(">>> CANTIDAD NO VALIDA <<<");
                    } else {
                        f = false;
                    }
                }

                System.out.print("Proveedor -> ");
                rm = new Scanner(System.in);
                String proveedor = rm.nextLine();

                System.out.print("Nombre del producto -> ");
                rm = new Scanner(System.in);
                String nombre = rm.nextLine();

                almacenar.add(new ProductosLimpieza(tipo, marca, codigo, proveedor, nombre, precio, cantInventariar));
                System.out.println("++ PRODUCTO AGREGADO EXITOSAMENTE ++");
            }
            case 3 -> {
                String categoria = "";
                System.out.print("""
                                 categoria:
                                 1. Lacteos
                                 2. Gaseosas
                                 3. Jugos
                                 4. Agua
                                -> """);
                rm = new Scanner(System.in);
                int med = rm.nextInt();
                switch (med) {
                    case 1 ->
                        categoria = "Lacteos";
                    case 2 ->
                        categoria = "Gaseosas";
                    case 3 ->
                        categoria = "Jugos";
                    case 4 ->
                        categoria = "Agua";
                }

                String empaque = "";
                System.out.print("""
                                 categoria:
                                 1. Botella/Bote
                                 2. Caja
                                 3. Lata
                                -> """);
                rm = new Scanner(System.in);
                int q = rm.nextInt();
                switch (q) {
                    case 1 ->
                        empaque = "Botella/Bote";
                    case 2 ->
                        empaque = "Caja";
                    case 3 ->
                        empaque = "Lata";
                }

                String tamanio = "";
                System.out.print("""
                                 categoria:
                                 1. Pequenio
                                 2. Mediano
                                 3. Grande
                                -> """);
                rm = new Scanner(System.in);
                int qa = rm.nextInt();
                switch (qa) {
                    case 1 ->
                        tamanio = "Pequenio";
                    case 2 ->
                        tamanio = "Mediano";
                    case 3 ->
                        tamanio = "Grande";
                }

                System.out.print("Nombre del producto -> ");
                rm = new Scanner(System.in);
                String nombre = rm.nextLine();

                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }

                Date fecha = new Date();
                boolean o = true;
                while (o) {
                    System.out.print("""
                                   Fecha de vencimiento:
                                   Dia ->""");
                    rm = new Scanner(System.in);
                    int dia = rm.nextInt();

                    System.out.print("Mes-> ");
                    rm = new Scanner(System.in);
                    int mes = rm.nextInt();

                    System.out.print("Anio-> ");
                    rm = new Scanner(System.in);
                    int anio = rm.nextInt();

                    o = validarFecha(dia, mes, anio);
                    if (o == false) {
                        fecha.setDate(dia);
                        fecha.setMonth(mes);
                        fecha.setYear(anio - 1900);
                    } else {
                        System.out.println(">>> FECHA NO VALIDA <<<");
                    }
                }

                almacenar.add(new Liquidos(categoria, empaque, tamanio, nombre, precio, fecha));
                System.out.println("++ PRODUCTO AGREGADO EXITOSAMENTE ++");
            }
            case 4 -> {
                System.out.print("Lugar de procedencia -> ");
                rm = new Scanner(System.in);
                String procedencia = rm.nextLine();

                boolean f = true;
                int cantInventariar = 0;
                while (f) {
                    System.out.print("Cantidad a inventariar -> ");
                    rm = new Scanner(System.in);
                    cantInventariar = rm.nextInt();
                    if (cantInventariar <= 0) {
                        System.out.println(">>> CANTIDAD NO VALIDA <<<");
                    } else {
                        f = false;
                    }
                }

                String tipo = "";
                System.out.print("""
                                 Tipo:
                                 1. Res
                                 2. Carne Blanca
                                 3. Cerdo
                                -> """);
                rm = new Scanner(System.in);
                int qa = rm.nextInt();
                switch (qa) {
                    case 1 ->
                        tipo = "Res";
                    case 2 ->
                        tipo = "Blanca";
                    case 3 ->
                        tipo = "Cerdo";
                }

                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }

                almacenar.add(new CarnesEmbutidos(procedencia, tipo, cantInventariar, precio));
                System.out.println("++ PRODUCTO AGREGADO EXITOSAMENTE ++");

            }
            case 5 -> {
                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }

                boolean f = true;
                int cantInventariar = 0;
                while (f) {
                    System.out.print("Cantidad a inventariar -> ");
                    rm = new Scanner(System.in);
                    cantInventariar = rm.nextInt();
                    if (cantInventariar <= 0) {
                        System.out.println(">>> CANTIDAD NO VALIDA <<<");
                    } else {
                        f = false;
                    }
                }

                String categoria = "";
                System.out.print("""
                                 
                                 Producto:
                                 1. Fruta
                                 2. Verdura
                                -> """);
                rm = new Scanner(System.in);
                int qa = rm.nextInt();
                if (qa == 1) {
                    System.out.print("""
                                     
                                 Categoria:
                                 1. Citricos
                                 2. Tropical
                                 3. Grano
                                 4. Rica en fibra
                                -> """);
                    rm = new Scanner(System.in);
                    int qb = rm.nextInt();
                    switch (qb) {
                        case 1 ->
                            categoria = "Citricos";
                        case 2 ->
                            categoria = "Tropical";
                        case 3 ->
                            categoria = "Grano";
                        case 4 ->
                            categoria = "Rica en fibra";

                    }
                } else {
                    System.out.print("""
                                     
                                 Categoria:
                                 1. Tuberculos
                                 2. Legumbres
                                 3. De hojas
                                -> """);
                    rm = new Scanner(System.in);
                    int qb = rm.nextInt();
                    switch (qb) {
                        case 1 ->
                            categoria = "Tuberculos";
                        case 2 ->
                            categoria = "Legumbres";
                        case 3 ->
                            categoria = "De hojas";
                    }
                }

                almacenar.add(new FrutasVerduras(precio, cantInventariar, categoria, qa));
                System.out.println("++ PRODUCTO AGREGADO EXITOSAMENTE ++");
            }

        }
    }

    public static boolean validarFecha(int dia, int mes, int anio) {
        boolean validoFecha = false;
        if (dia < 1 || dia > 31) {
            validoFecha = true;
        }
        if (mes < 1 || mes > 12) {
            validoFecha = true;
        }

        if (mes == 2 && dia == 29 && anio % 400 == 0 ) {
            validoFecha = true;
        }
        return validoFecha;

    }

    public static void modificar() {
        if (almacenar.isEmpty()) {
            System.out.println("** NO HAY PRODUCTO **");
        } else {
            reporte();
            System.out.print("""
                         Ingrese Posicion del producto que desea modificar: 
                         -> """);
            rm = new Scanner(System.in);
            int pos = rm.nextInt();

            if (almacenar.get(pos) instanceof GranosBasicos) {
                modificargranos(pos);
            }
            if (almacenar.get(pos) instanceof ProductosLimpieza) {
                modlim(pos);
            }
            if (almacenar.get(pos) instanceof Liquidos) {
                modLiq(pos);
            }
            if (almacenar.get(pos) instanceof CarnesEmbutidos) {
                modCarnes(pos);
            }
            if (almacenar.get(pos) instanceof FrutasVerduras) {
                modFru(pos);
            }
        }
    }

    static void modificargranos(int pos) {
        System.out.print("""
                             Modificar:
                             1. Nombre de producto
                             2. Cantidad de quintales
                             3. Precio
                             4. Unidad de medida
                             5. Lugar de procedencia
                             -> """);
        rm = new Scanner(System.in);
        int opc = rm.nextInt();
        switch (opc) {
            case 1 -> {
                System.out.print("Ingrese nuevo nombre: ");
                rm = new Scanner(System.in);
                ((GranosBasicos) almacenar.get(pos)).setNombre(rm.nextLine());
            }
            case 2 -> {
                System.out.print("Ingrese nueva cantidad de quintales: ");
                rm = new Scanner(System.in);
                ((GranosBasicos) almacenar.get(pos)).setCantquin(rm.nextInt());
            }
            case 3 -> {
                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }
                ((GranosBasicos) almacenar.get(pos)).setPrecio(precio);
            }
            case 4 -> {
                String unimedida = "";
                System.out.print("""
                                Nueva Unidad de medida:
                                1. Libra
                                2. Medida
                                3. Kilo
                                -> """);
                rm = new Scanner(System.in);
                int med = rm.nextInt();
                switch (med) {
                    case 1 ->
                        unimedida = "Libra";
                    case 2 ->
                        unimedida = "Medida";
                    case 3 ->
                        unimedida = "Kilo";
                }
                rm = new Scanner(System.in);
                ((GranosBasicos) almacenar.get(pos)).setUnimedida(unimedida);
            }
            case 5 -> {
                System.out.print("Ingrese nuevo Lugar de procedencia: ");
                rm = new Scanner(System.in);
                ((GranosBasicos) almacenar.get(pos)).setProcedencia(rm.nextLine());
            }
        }
    }

    static void modlim(int pos) {
        System.out.print("""
                             Modificar:
                             1. Tipo
                             2. Marca
                             3. Precio
                             4. Codigo
                             5. Cantidad en inventario
                             6. Proveedor
                             7. Nombre del producto
                             -> """);
        rm = new Scanner(System.in);
        int opc = rm.nextInt();
        switch (opc) {
            case 1 -> {

                String tipo = "";
                System.out.print("""
                                Nuevo Tipo:
                                1. Liquido
                                2. Polvo
                                -> """);
                rm = new Scanner(System.in);
                int med = rm.nextInt();
                switch (med) {
                    case 1 ->
                        tipo = "Liquido";
                    case 2 ->
                        tipo = "Polvo";
                }
                ((ProductosLimpieza) almacenar.get(pos)).setTipo(tipo);

            }
            case 2 -> {
                System.out.print("Ingrese nueva marca: ");
                rm = new Scanner(System.in);
                String marca = rm.nextLine();
                ((ProductosLimpieza) almacenar.get(pos)).setMarca(marca);
            }
            case 3 -> {

                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Nuevo Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }
                ((ProductosLimpieza) almacenar.get(pos)).setPrecio(precio);
            }

            case 4 -> {
                String codigo = "";
                boolean x = true;
                while (x) {
                    System.out.print("Nuevo Codigo -> ");
                    rm = new Scanner(System.in);
                    codigo = rm.nextLine();
                    x = false;
                    for (Object o : almacenar) {
                        if (o instanceof ProductosLimpieza) {
                            if (((ProductosLimpieza) o).getCodigo().equals(codigo)) {
                                System.out.println(">>> CODIGO YA ESTA EN USO <<<");
                                x = true;
                            }
                        }
                    }
                }
                ((ProductosLimpieza) almacenar.get(pos)).setCodigo(codigo);
            }

            case 5 -> {
                boolean f = true;
                int cantInventariar = 0;
                while (f) {
                    System.out.print("Nueva Cantidad en inventario -> ");
                    rm = new Scanner(System.in);
                    cantInventariar = rm.nextInt();
                    if (cantInventariar <= 0) {
                        System.out.println(">>> CANTIDAD NO VALIDA <<<");
                    } else {
                        f = false;
                    }
                }
                ((ProductosLimpieza) almacenar.get(pos)).setCantinventario(cantInventariar);
            }

            case 6 -> {
                System.out.print("Ingrese nuevo proveedor: ");
                rm = new Scanner(System.in);
                String pr = rm.nextLine();
                ((ProductosLimpieza) almacenar.get(pos)).setProveedor(pr);
            }
            case 7 -> {
                System.out.print("Ingrese nuevo Nombre del producto: ");
                rm = new Scanner(System.in);
                String name = rm.nextLine();
                ((ProductosLimpieza) almacenar.get(pos)).setNombre(name);
            }
        }// fin del switch
    }

    static void modLiq(int pos) {
        System.out.print("""
                             Modificar:
                             1. Nombre de producto
                             2. Categoria
                             3. Precio
                             4. Forma de empaque
                             5. Tamanio
                             6. Fecha de vencimiento
                             -> """);
        rm = new Scanner(System.in);
        int opc = rm.nextInt();
        switch (opc) {
            case 1 -> {
                System.out.print("Ingrese nuevo nombre: ");
                rm = new Scanner(System.in);
                String name = rm.nextLine();
                ((Liquidos) almacenar.get(pos)).setNombre(name);
            }
            case 2 -> {
                String categoria = "";
                System.out.print("""
                                 categoria:
                                 1. Lacteos
                                 2. Gaseosas
                                 3. Jugos
                                 4. Agua
                                -> """);
                rm = new Scanner(System.in);
                int med = rm.nextInt();
                switch (med) {
                    case 1 ->
                        categoria = "Lacteos";
                    case 2 ->
                        categoria = "Gaseosas";
                    case 3 ->
                        categoria = "Jugos";
                    case 4 ->
                        categoria = "Agua";
                }
                ((Liquidos) almacenar.get(pos)).setCategoria(categoria);
            }
            case 3 -> {
                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Nuevo Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }
                ((Liquidos) almacenar.get(pos)).setPrecio(precio);
            }
            case 4 -> {
                String empaque = "";
                System.out.print("""
                                 Nuevo empaque:
                                 1. Botella/Bote
                                 2. Caja
                                 3. Lata
                                -> """);
                rm = new Scanner(System.in);
                int q = rm.nextInt();
                switch (q) {
                    case 1 ->
                        empaque = "Botella/Bote";
                    case 2 ->
                        empaque = "Caja";
                    case 3 ->
                        empaque = "Lata";
                }
                ((Liquidos) almacenar.get(pos)).setEmapque(empaque);

            }
            case 5 -> {
                String tamanio = "";
                System.out.print("""
                                 Tamanio:
                                 1. Pequenio
                                 2. Mediano
                                 3. Grande
                                -> """);
                rm = new Scanner(System.in);
                int qa = rm.nextInt();
                switch (qa) {
                    case 1 ->
                        tamanio = "Pequenio";
                    case 2 ->
                        tamanio = "Mediano";
                    case 3 ->
                        tamanio = "Grande";
                }
                ((Liquidos) almacenar.get(pos)).setTamanio(tamanio);
            }
            case 6 -> {
                Date fecha = new Date();
                boolean o = true;
                while (o) {
                    System.out.print("""
                                   Fecha de vencimiento:
                                   Dia ->""");
                    rm = new Scanner(System.in);
                    int dia = rm.nextInt();

                    System.out.print("Mes-> ");
                    rm = new Scanner(System.in);
                    int mes = rm.nextInt();

                    System.out.print("Anio-> ");
                    rm = new Scanner(System.in);
                    int anio = rm.nextInt();

                    o = validarFecha(dia, mes, anio);
                    if (o == false) {
                        fecha.setDate(dia);
                        fecha.setMonth(mes);
                        fecha.setYear(anio - 1900);
                    } else {
                        System.out.println(">>> FECHA NO VALIDA <<<");
                    }
                }
                ((Liquidos) almacenar.get(pos)).setFechavencimiento(fecha);
            }
        }

    }

    static void modCarnes(int pos) {
        System.out.print("""
                             Modificar:
                             1. Cantidad en inventario
                             2. Tipo
                             3. Precio
                             4. Lugar de procedencia
                             -> """);
        rm = new Scanner(System.in);
        int opc = rm.nextInt();
        switch (opc) {
            case 1 -> {
                boolean f = true;
                int cantInventariar = 0;
                while (f) {
                    System.out.print("Nueva Cantidad en inventario -> ");
                    rm = new Scanner(System.in);
                    cantInventariar = rm.nextInt();
                    if (cantInventariar <= 0) {
                        System.out.println(">>> CANTIDAD NO VALIDA <<<");
                    } else {
                        f = false;
                    }
                }
                ((CarnesEmbutidos) almacenar.get(pos)).setCantinventario(cantInventariar);
            }
            case 2 -> {
                String tipo = "";
                System.out.print("""
                                 Nuevo Tipo:
                                 1. Res
                                 2. Carne Blanca
                                 3. Cerdo
                                -> """);
                rm = new Scanner(System.in);
                int qa = rm.nextInt();
                switch (qa) {
                    case 1 ->
                        tipo = "Res";
                    case 2 ->
                        tipo = "Blanca";
                    case 3 ->
                        tipo = "Cerdo";
                }
                ((CarnesEmbutidos) almacenar.get(pos)).setTipo(tipo);
            }
            case 3 -> {
                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Nuevo Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }
                ((CarnesEmbutidos) almacenar.get(pos)).setPrecio(precio);

            }
            case 4 -> {
                System.out.print("Nuevo Lugar de procedencia -> ");
                rm = new Scanner(System.in);
                String lu = rm.nextLine();
                ((CarnesEmbutidos) almacenar.get(pos)).setProcedencia(lu);
            }
        }
    }

    static void modFru(int pos) {
        System.out.print("""
                             Modificar:
                             1. Cantidad en inventario
                             2. Categoria
                             3. Precio
                             -> """);
        rm = new Scanner(System.in);
        int opc = rm.nextInt();
        switch (opc) {
            case 1 -> {
                boolean f = true;
                int cantInventariar = 0;
                while (f) {
                    System.out.print("Nueva Cantidad en inventario -> ");
                    rm = new Scanner(System.in);
                    cantInventariar = rm.nextInt();
                    if (cantInventariar <= 0) {
                        System.out.println(">>> CANTIDAD NO VALIDA <<<");
                    } else {
                        f = false;
                    }
                }
                ((FrutasVerduras) almacenar.get(pos)).setcantinventariar(cantInventariar);
            }
            case 2 -> {
                String cat = "";
                if (((FrutasVerduras) almacenar.get(pos)).getTipo() == 1) {
                    System.out.println("""
                                       Nueva categoria:
                                       1. Citricos
                                       2. Tropical
                                       3. Grano
                                       4. Rica en fibra
                                       -> """);
                    rm = new Scanner(System.in);
                    int qb = rm.nextInt();
                    switch (qb) {
                        case 1 ->
                            cat = "Citricos";
                        case 2 ->
                            cat = "Tropical";
                        case 3 ->
                            cat = "Grano";
                        case 4 ->
                            cat = "Rica en fibra";
                    }

                } else {
                    System.out.print("""
                                     
                                 Categoria:
                                 1. Tuberculos
                                 2. Legumbres
                                 3. De hojas
                                -> """);
                    rm = new Scanner(System.in);
                    int qb = rm.nextInt();
                    switch (qb) {
                        case 1 ->
                            cat = "Tuberculos";
                        case 2 ->
                            cat = "Legumbres";
                        case 3 ->
                            cat = "De hojas";
                    }
                }
                ((FrutasVerduras) almacenar.get(pos)).setCategoria(cat);
            }
            case 3 -> {
                boolean p = true;
                int precio = 0;
                while (p) {
                    System.out.print("Nuevo Precio -> ");
                    rm = new Scanner(System.in);
                    precio = rm.nextInt();
                    if (precio <= 0) {
                        System.out.println(">>> PRECIO NO VALIDO <<<");
                    } else {
                        p = false;
                    }
                }
                ((FrutasVerduras) almacenar.get(pos)).setPrecio(precio);
            }

        }
    }

    public static void factura() {

        ArrayList<Factura> fact = new ArrayList();
        boolean x = true;
        if (almacenar.isEmpty()) {
            System.out.println("** NO PRODUCTOS EN INVENTARIO **");
        } else {
            while (x) {
                System.out.println("*** PRODUCTOS DISPONIBLES ***");
                reporte();
                System.out.println("\nIngrese posicion del producto a comprar");
                rm = new Scanner(System.in);
                int opc = rm.nextInt();
                boolean y = true;
                while (y) {

                    if (almacenar.get(opc) instanceof GranosBasicos granosBasicos) {

                        System.out.print("Cantidad Disponible: " + granosBasicos.getCantquin() + "\n"
                                + "Cuantos Quintales Desea -> ");
                        rm = new Scanner(System.in);
                        int cant = rm.nextInt();
                        if (cant <= granosBasicos.getCantquin()) {
                            fact.add(new Factura(granosBasicos.getPrecio(), cant, granosBasicos.getNombre()));
                            System.out.println("/ PRODUCTO AGREGADO AL CARRITO /");
                            granosBasicos.setCantquin(granosBasicos.getCantquin() - cant);
                            if (granosBasicos.getCantquin() == 0) {
                                almacenar.remove(granosBasicos);
                            }
                            y = false;
                        } else {
                            System.out.println("[ INGRESE UNA CANTIDAD VALIDA ]");
                        }
                    }

                    if (almacenar.get(opc) instanceof ProductosLimpieza pl) {

                        System.out.print("Cantidad Disponible: " + pl.getCantinventario() + "\n"
                                + "Cantidad que Desea -> ");
                        rm = new Scanner(System.in);
                        int cant = rm.nextInt();
                        if (cant <= pl.getCantinventario()) {
                            fact.add(new Factura(pl.getPrecio(), cant, pl.getNombre()));
                            System.out.println("/ PRODUCTO AGREGADO AL CARRITO /");
                            pl.setCantinventario(pl.getCantinventario() - cant);
                            if (pl.getCantinventario() ==0) {
                                almacenar.remove(pl);
                            }
                            y = false;
                        } else {
                            System.out.println("[ INGRESE UNA CANTIDAD VALIDA ]");
                        }
                    }
                    if (almacenar.get(opc) instanceof Liquidos lq) {
                        System.out.print("""
                                     Cantidad Disponible: 1
                                     Cantidad que Desea -> """);
                        rm = new Scanner(System.in);
                        int cant = rm.nextInt();
                        if (cant == 1) {
                            fact.add(new Factura(lq.getPrecio(), cant, lq.getNombre()));
                            System.out.println("/ PRODUCTO AGREGADO AL CARRITO /");
                            almacenar.remove(lq);
                            y = false;
                        } else {
                            System.out.println("[ INGRESE UNA CANTIDAD VALIDA ]");

                        }
                    }
                    if (almacenar.get(opc) instanceof CarnesEmbutidos ce) {
                        System.out.print("Cantidad Disponible: " + ce.getCantinventario() + "\n"
                                + "Cantidad que Desea -> ");
                        rm = new Scanner(System.in);
                        int cant = rm.nextInt();
                        if (cant <= ce.getCantinventario()) {
                            fact.add(new Factura(ce.getPrecio(), cant, "Carne " + ce.getTipo()));
                            System.out.println("/ PRODUCTO AGREGADO AL CARRITO /");
                            ce.setCantinventario(ce.getCantinventario() - cant);
                            if (ce.getCantinventario() == 0) {
                                almacenar.remove(ce);
                            }
                            y = false;
                        } else {
                            System.out.println("[ INGRESE UNA CANTIDAD VALIDA ]");
                        }
                    }
                    if (almacenar.get(opc) instanceof FrutasVerduras fv) {
                        System.out.print("Cantidad Disponible: " + fv.getcantinventariar() + "\n"
                                + "Cantidad que Desea -> ");
                        rm = new Scanner(System.in);
                        int cant = rm.nextInt();
                        if (cant <= fv.getcantinventariar()) {
                            fact.add(new Factura(fv.getPrecio(), cant, "Fruta/Verdura"));
                            System.out.println("/ PRODUCTO AGREGADO AL CARRITO /");
                            fv.setcantinventariar(fv.getcantinventariar() - cant);
                            if (fv.getcantinventariar() == 0) {
                                almacenar.remove(fv);
                            }
                            y = false;

                        } else {
                            System.out.println("[ INGRESE UNA CANTIDAD VALIDA ]");
                        }
                    }
                    if (y == false) {
                        System.out.print("Desea seguir comprando[si/no] -> ");
                        rm = new Scanner(System.in);
                        String op = rm.next();
                        if (op.equals("NO") || op.equals("no") || op.equals("No") || op.equals("nO")) {
                            x = false;
                        }
                    }
                }

            }
            int sub=0;
            System.out.println("""
                           ----------------------------------------------------------------
                           ------------------ Supermercado LA COLONIA ---------------------
                           ----------------------------------------------------------------
                           PRODUCTO             PRECIO UNI          CANTIDAD          TOTAL""");
            for (Factura f : fact) {
                System.out.println(f);
                sub+=f.getTot();
            }
            double isv = sub*0.15;
            double total = isv+sub;
            System.out.println("----------------------------------------------------------------\n"
                    + "SUB TOTAL                                         L.     " + sub+"\n"
                    + "ISV 15%                                           L.     " + isv+"\n"
                    + "Total a pagar                                     L.     "+total);
        }
    }

    public static void eliminar() {
        if (almacenar.isEmpty()) {
            System.out.println("** NO HAY PRODUCTO **");
        } else {

            reporte();
            System.out.print("Posicion a eliminar -> ");
            rm = new Scanner(System.in);
            almacenar.remove(rm.nextInt());
            System.out.println("-- PRODUCTO ELIMINADO EXITOSAMENTE --");
        }
    }

    public static void reporte() {
//        if (almacenar.isEmpty()) {
//            System.out.println("** NO HAY PRODUCTO **");
//        } else {

        String granos = "", limp = "", liq = "", carn = "", fru = "";
        for (Object o : almacenar) {
            if (o instanceof GranosBasicos) {
                granos += "Posicion " + almacenar.indexOf(o) + o;
            }
            if (o instanceof Liquidos) {
                liq += "Posicion " + almacenar.indexOf(o) + o;
            }
            if (o instanceof CarnesEmbutidos) {
                carn += "Posicion " + almacenar.indexOf(o) + o;
            }
            if (o instanceof ProductosLimpieza) {
                limp += "Posicion " + almacenar.indexOf(o) + o;
            }
            if (o instanceof FrutasVerduras) {
                fru += "Posicion " + almacenar.indexOf(o) + o;
            }
        }
        System.out.print(granos);
        System.out.print(limp);
        System.out.print(liq);
        System.out.print(carn);
        System.out.print(fru);
        //}
    }

}
