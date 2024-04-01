package main

import (
	"fmt"
	"net"
	"os"
)

func gestionErreur(err error) {
	if err != nil {
		fmt.Println("Erreur :", err)
		os.Exit(1)
	}
}

const (
	IP   = "172.168.1.2" // IP locale
	PORT = "8080"      // Port utilisé
	ip_broadcast = "172.168.1.7"
)

func main() {
	fmt.Println("Lancement du serveur ...")

	// On écoute sur le port 8080
	ln, err := net.Listen("tcp", fmt.Sprintf("%s:%s", IP, PORT))
	gestionErreur(err)
	defer ln.Close() // On ferme la connexion à la fin du  main

	// Boucle pour toujours écouter les connexions entrantes (Ctrl+C pour quitter)
	for {
		conn, err := ln.Accept()
		gestionErreur(err)

		// Information sur les clients qui se connectent
		fmt.Println("Un client est connecté depuis", conn.RemoteAddr())

		go handleClient(conn) // Gérer la connexion client dans une goroutine
	}
}

func handleClient(conn net.Conn) {
	defer conn.Close()

	// Boucle pour toujours écouter les messages du client
	for {
		buffer := make([]byte, 4096)
		length, err := conn.Read(buffer)

		if err != nil {
			fmt.Println("Le client s'est déconnecté")
			return
		}

		message := string(buffer[:length])
		fmt.Print("Client1:", message)
		
		// On envoie le message au client pour qu'il l'affiche
		_, err = conn.Write([]byte(message + "\n"))
		gestionErreur(err)
	}
}
