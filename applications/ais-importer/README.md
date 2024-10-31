# ais antlr4 example

Reads [ais.csv](src/main/resources/ais.csv), parses via [AISData.g4)](src/main/antlr4/com/mycompany/myapp/ais/parser/AISData.g4) into [AISDataPojo](src/main/java/com/mycompany/myapp/ais/AISDataPojo.java) via [](src/main/java/com/mycompany/myapp/ais/AISDataParser.java)

```bash
mvn \
 clean \
 antlr4:antlr4 \
 compile \
 spring-boot:run
```

Output
```text
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.0)

AISDataPojo{MMSI='368926035', BaseDateTime='2023-01-01T00:00:05', LAT=38.65165, LON=90.17964, SOG=0.1, COG=360.0, Heading=511.0, VesselName='KIMMSWICK', IMO='null', CallSign='AENA', VesselType=33, Status=15, Length=null, Width=null, Draft=null, Cargo='33', TransceiverClass='A'}
AISDataPojo{MMSI='367647050', BaseDateTime='2023-01-01T00:00:04', LAT=30.16506, LON=-90.99936, SOG=6.3, COG=161.4, Heading=511.0, VesselName='USS CAIRO', IMO='null', CallSign='WDH7325', VesselType=31, Status=0, Length=20, Width=null, Draft=null, Cargo='31', TransceiverClass='A'}
AISDataPojo{MMSI='352001704', BaseDateTime='2023-01-01T00:00:04', LAT=28.91963, LON=-94.37033, SOG=14.7, COG=97.5, Heading=97.0, VesselName='ENEOS EXPLORER', IMO='IMO9935492', CallSign='3E2723', VesselType=80, Status=0, Length=230, Width=36, Draft=11.7, Cargo='80', TransceiverClass='A'}
AISDataPojo{MMSI='367104060', BaseDateTime='2023-01-01T00:00:00', LAT=34.33537, LON=-119.56046, SOG=14.8, COG=202.9, Heading=511.0, VesselName='ALAN T', IMO='IMO8982577', CallSign='WDC9571', VesselType=60, Status=15, Length=28, Width=7, Draft=null, Cargo='0', TransceiverClass='A'}
AISDataPojo{MMSI='367099730', BaseDateTime='2023-01-01T00:00:02', LAT=26.53889, LON=-97.40485, SOG=0.0, COG=360.0, Heading=511.0, VesselName='JESSIE M', IMO='null', CallSign='WDJ2892', VesselType=52, Status=0, Length=0, Width=0, Draft=0.0, Cargo='52', TransceiverClass='A'}
AISDataPojo{MMSI='367579120', BaseDateTime='2023-01-01T00:00:03', LAT=29.32348, LON=-94.78112, SOG=0.0, COG=248.5, Heading=511.0, VesselName='TERRY FONTENOT', IMO='null', CallSign='WDG8590', VesselType=31, Status=0, Length=16, Width=7, Draft=null, Cargo='52', TransceiverClass='A'}
AISDataPojo{MMSI='367015890', BaseDateTime='2023-01-01T00:00:09', LAT=39.853, LON=-75.24165, SOG=0.0, COG=360.0, Heading=511.0, VesselName='DOROTHY J', IMO='null', CallSign='WDC3893', VesselType=31, Status=0, Length=19, Width=7, Draft=null, Cargo='31', TransceiverClass='A'}
AISDataPojo{MMSI='366995260', BaseDateTime='2023-01-01T00:00:01', LAT=30.47154, LON=-91.19402, SOG=0.6, COG=166.3, Heading=183.0, VesselName='CAPT JAMES HOOVER', IMO='null', CallSign='WDC2583', VesselType=31, Status=0, Length=16, Width=6, Draft=null, Cargo='52', TransceiverClass='A'}
AISDataPojo{MMSI='538008717', BaseDateTime='2023-01-01T00:00:01', LAT=23.64963, LON=-83.18562, SOG=5.7, COG=269.0, Heading=274.0, VesselName='VELOS FORTUNA', IMO='IMO9347310', CallSign='V7A2686', VesselType=89, Status=0, Length=182, Width=32, Draft=7.5, Cargo='89', TransceiverClass='A'}
AISDataPojo{MMSI='368261060', BaseDateTime='2023-01-01T00:00:06', LAT=30.51808, LON=-91.22525, SOG=9.8, COG=246.6, Heading=246.0, VesselName='AMERICAN SYMPHONY', IMO='null', CallSign='null', VesselType=60, Status=0, Length=100, Width=18, Draft=0.0, Cargo='60', TransceiverClass='A'}
AISDataPojo{MMSI='367321680', BaseDateTime='2023-01-01T00:00:04', LAT=30.72482, LON=-88.05849, SOG=0.0, COG=319.7, Heading=511.0, VesselName='BEN R JOHNSON', IMO='null', CallSign='WDE2189', VesselType=31, Status=null, Length=17, Width=6, Draft=null, Cargo='null', TransceiverClass='B'}
AISDataPojo{MMSI='367745570', BaseDateTime='2023-01-01T00:00:01', LAT=29.72929, LON=-95.05452, SOG=0.0, COG=33.5, Heading=147.0, VesselName='QUINCEY CENAC', IMO='null', CallSign='WDI9133', VesselType=31, Status=12, Length=null, Width=null, Draft=null, Cargo='57', TransceiverClass='A'}
AISDataPojo{MMSI='367610770', BaseDateTime='2023-01-01T00:00:04', LAT=27.9532, LON=-82.44167, SOG=0.0, COG=360.0, Heading=511.0, VesselName='MR DUCK', IMO='null', CallSign='WDH3774', VesselType=31, Status=15, Length=15, Width=6, Draft=null, Cargo='52', TransceiverClass='A'}
AISDataPojo{MMSI='338224354', BaseDateTime='2023-01-01T00:00:02', LAT=47.64484, LON=-122.31189, SOG=0.0, COG=360.0, Heading=511.0, VesselName='WAYFINDER', IMO='IMO0000000', CallSign='null', VesselType=37, Status=null, Length=10, Width=3, Draft=null, Cargo='null', TransceiverClass='B'}
AISDataPojo{MMSI='367476050', BaseDateTime='2023-01-01T00:00:02', LAT=46.09354, LON=-122.9242, SOG=0.0, COG=150.7, Heading=107.0, VesselName='CLACKAMAS', IMO='null', CallSign='WDF6614', VesselType=31, Status=0, Length=20, Width=6, Draft=null, Cargo='33', TransceiverClass='A'}
AISDataPojo{MMSI='316047734', BaseDateTime='2023-01-01T00:00:05', LAT=49.31105, LON=-123.09294, SOG=0.0, COG=360.0, Heading=511.0, VesselName='FINNESS', IMO='IMO0000000', CallSign='null', VesselType=37, Status=null, Length=17, Width=5, Draft=null, Cargo='null', TransceiverClass='B'}
AISDataPojo{MMSI='368233490', BaseDateTime='2023-01-01T00:00:06', LAT=41.17235, LON=-72.81058, SOG=7.4, COG=85.4, Heading=87.0, VesselName='MULBERRY', IMO='null', CallSign='WDM7381', VesselType=57, Status=12, Length=18, Width=7, Draft=2.2, Cargo='57', TransceiverClass='A'}
AISDataPojo{MMSI='368012890', BaseDateTime='2023-01-01T00:00:06', LAT=35.52699, LON=-89.95959, SOG=0.0, COG=294.6, Heading=511.0, VesselName='MISS KIM', IMO='null', CallSign='WDJ8080', VesselType=31, Status=0, Length=18, Width=7, Draft=null, Cargo='31', TransceiverClass='A'}
AISDataPojo{MMSI='367474680', BaseDateTime='2023-01-01T00:00:08', LAT=29.7032, LON=-91.22162, SOG=0.0, COG=250.3, Heading=511.0, VesselName='CUSTOM', IMO='null', CallSign='WDF6479', VesselType=31, Status=0, Length=17, Width=7, Draft=null, Cargo='57', TransceiverClass='A'}
AISDataPojo{MMSI='311073800', BaseDateTime='2023-01-01T00:00:08', LAT=29.2333, LON=-94.45173, SOG=0.0, COG=343.7, Heading=85.0, VesselName='EURO', IMO='IMO9567702', CallSign='C6AA5', VesselType=80, Status=1, Length=274, Width=48, Draft=13.7, Cargo='80', TransceiverClass='A'}
AISDataPojo{MMSI='368216680', BaseDateTime='2023-01-01T00:00:00', LAT=47.3036, LON=-122.50945, SOG=2.9, COG=143.1, Heading=143.0, VesselName='MISTAKES WERE MADE', IMO='IMO0000000', CallSign='null', VesselType=37, Status=null, Length=10, Width=6, Draft=null, Cargo='null', TransceiverClass='B'}
AISDataPojo{MMSI='338192032', BaseDateTime='2023-01-01T00:00:03', LAT=47.67331, LON=-122.20882, SOG=0.0, COG=168.0, Heading=511.0, VesselName='TAINA', IMO='IMO0000000', CallSign='null', VesselType=37, Status=null, Length=17, Width=7, Draft=null, Cargo='null', TransceiverClass='B'}
AISDataPojo{MMSI='316050437', BaseDateTime='2023-01-01T00:00:09', LAT=49.29301, LON=-123.04469, SOG=0.0, COG=0.0, Heading=181.0, VesselName='SENTINEL 304', IMO='null', CallSign='CFA3844', VesselType=90, Status=15, Length=74, Width=20, Draft=0.0, Cargo='90', TransceiverClass='A'}
```
