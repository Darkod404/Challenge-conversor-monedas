# Conversor de divisas

## Descripcion

Este es un desafío de programación realizado en **Java** parte del progrma ONE de Oracle y Alura Latam, se trata de un Conversor de Monedas. Se implementó la API de Exchange Rate API para las solicitudes de tasas de cambio, también se utilizó la librería Gson para manipular datos JSON. La interfaz de usuario es a través de consola.


## Menu

```
              *****************************************************************************
              *                BIENVENIDO AL CONVERSOR DE DIVISAS                         *
              *****************************************************************************
              * Mas Utilizadas:                                                           *
              *                                                                           *
              *   USD - Estados Unidos        CAD - Canada                                *
              *   EUR - Union Europea         CHF - Suiza                                 *
              *   GBP - Reino Unido           CNY - China                                 *
              *   JPY - Japon                 SEK - Suecia                                *
              *   AUD - Australia             NZD - Nueva Zelanda                         *
              *                                                                           *
              *****************************************************************************
              *    1- Convertir                                                           *
              *    2- Comparacion global                                                  *
              *    0- Salir                                                               *
              *****************************************************************************
```
### Opcion 1
```
Ingrese la moneda a convertir
>> usd
Ingrese la moneda a convertir
>> eur
Ingrese el monto
>> 15
```
### Respuesta 
```
              -----------------------------------------------------------------------------
                                     15 USD == 14.031 EUR
              -----------------------------------------------------------------------------
```
### Opcion 2
```
Ingrese la moneda o el pais para comparar
>> eur
```
### Respuesta 
```
----------------------------------------------------------------------------------------
1 EUR equivale a:
{EUR=1.0, AED=3.9262, AFN=76.8932, ALL=100.9438, AMD=416.3864, ANG=1.9137, AOA=905.2564, ARS=924.4949, AUD=1.6511, AWG=1.9137, AZN=1.8121, BAM=1.9558, BBD=2.1382, BDT=117.337, BGN=1.9558, BHD=0.402, BIF=3050.6022, BMD=1.0691, BND=1.4558, BOB=7.3791, BRL=5.503, BSD=1.0691, BTN=88.9998, BWP=14.8965, BYN=3.4755, BZD=2.1382, CAD=1.4623, CDF=2956.1171, CHF=0.9746, CLP=1016.1598, CNY=7.7513, COP=4161.1302, CRC=533.6176, CUP=25.6581, CVE=110.265, CZK=25.2474, DJF=189.9996, DKK=7.4593, DOP=62.8371, DZD=143.5434, EGP=51.2309, ERN=16.0363, ETB=60.8481, FJD=2.4451, FKP=0.8601, FOK=7.4602, GBP=0.8601, GEL=2.853, GGP=0.8601, GHS=14.4973, GIP=0.8601, GMD=70.7437, GNF=9167.2406, GTQ=8.2804, GYD=222.9137, HKD=8.3773, HNL=26.3114, HRK=7.5345, HTG=141.1915, HUF=393.3871, IDR=17325.6618, ILS=4.0344, IMP=0.8601, INR=88.9894, IQD=1396.2936, IRR=45315.2005, ISK=150.3016, JEP=0.8601, JMD=165.9066, JOD=0.758, JPY=165.4877, KES=142.8586, KGS=95.0137, KHR=4317.4868, KID=1.6512, KMF=491.9678, KRW=1470.2779, KWD=0.3287, KYD=0.8909, KZT=473.8543, LAK=23175.7015, LBP=95683.4824, LKR=320.9409, LRD=205.4739, LSL=20.4656, LYD=5.1958, MAD=10.8329, MDL=19.0485, MGA=4671.8901, MKD=61.495, MMK=2693.651, MNT=3664.7296, MOP=8.6289, MRU=42.3502, MUR=49.6358, MVR=16.4536, MWK=1861.2661, MXN=18.1955, MYR=5.1042, MZN=68.3653, NAD=20.4656, NGN=1295.3784, NIO=39.2111, NOK=11.7025, NPR=142.3996, NZD=1.803, OMR=0.4111, PAB=1.0691, PEN=3.9545, PGK=4.0461, PHP=61.48, PKR=297.8918, PLN=4.3108, PYG=7840.6564, QAR=3.8915, RON=4.9762, RSD=117.1892, RUB=99.7448, RWF=1400.3162, SAR=4.0091, SBD=8.9226, SCR=14.9457, SDG=476.2395, SEK=11.5788, SGD=1.4557, SHP=0.8601, SLE=24.2029, SLL=24204.501, SOS=608.7737, SRD=37.0767, SSP=1705.0615, STN=24.5, SYP=13759.8528, SZL=20.4656, THB=39.5012, TJS=11.6746, TMT=3.7295, TND=3.3667, TOP=2.5107, TRY=34.8338, TTD=7.3826, TVD=1.6512, TWD=34.8028, TZS=2765.1012, UAH=42.2046, UGX=4074.4447, USD=1.0691, UYU=41.0406, UZS=13528.4196, VES=38.9247, VND=27223.7524, VUV=130.0155, WST=2.9342, XAF=655.957, XCD=2.8865, XDR=0.8095, XOF=655.957, XPF=119.332, YER=266.8088, ZAR=20.4605, ZMW=27.7789, ZWL=14.1164}
----------------------------------------------------------------------------------------
```
## Librerias
- Gson 2.10.1
>>>>>>> 0f1e1cc45fab40b8f98cf917ac1f5e9ef5c2da56
