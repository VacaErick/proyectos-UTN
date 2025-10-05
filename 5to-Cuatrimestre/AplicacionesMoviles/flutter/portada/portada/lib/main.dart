import 'package:flutter/material.dart';

void main() {
  runApp(MiApp());
}

class MiApp extends StatelessWidget {
  const MiApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'ejemplo textfield',
      home: Scaffold(
        appBar: AppBar(
          title: Text('ingresa texto'),
        ),
        body: Center(
          child: TextField(
            decoration: InputDecoration(labelText: 'introduce tu nombre'),
          ),
        ),
      ),
    );
  }
}
